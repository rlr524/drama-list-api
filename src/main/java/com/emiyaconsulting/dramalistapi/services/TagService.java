package com.emiyaconsulting.dramalistapi.services;

import com.emiyaconsulting.dramalistapi.dao.TagRepository;
import com.emiyaconsulting.dramalistapi.entity.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class TagService {
    private final TagRepository tagRepository;

    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public Iterable<Tag> list() {
        return tagRepository.findAll();
    }

    public Tag save(Tag tag) {
        return tagRepository.save(tag);
    }

    public Tag get(Long id) {
        Optional<Tag> tagOptional = tagRepository.findById(id);
        if (tagOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        }
        return tagOptional.get();
    }

    public Tag update(Long id, Tag tag) {
        Optional<Tag> tagOptional = tagRepository.findById(id);
        if (tagOptional.isEmpty()) {
            throw new ResponseStatusException(
                    org.springframework.http.HttpStatus.NOT_FOUND, "Tag not found");
        }
        Tag existingTag = tagOptional.get();
        existingTag.setTagName(tag.getTagName());
        return tagRepository.save(existingTag);
    }

    public void delete(Long id) {
        tagRepository.deleteById(id);
    }
}
