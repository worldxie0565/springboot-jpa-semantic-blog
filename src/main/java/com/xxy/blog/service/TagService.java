package com.xxy.blog.service;

import com.xxy.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TagService {
    Page<Tag> listTag(Pageable pageable);
    Tag saveTag(Tag tag);
    Tag getTagByName(String name);

    Tag getById(Long id);

    void deleteById(Long id);

    Tag updateTagById(Long id, Tag tag);
}
