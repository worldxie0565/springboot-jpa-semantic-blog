package com.xxy.blog.service;

import com.xxy.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {
    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    Tag saveTag(Tag tag);
    Tag getTagByName(String name);

    Tag getById(Long id);

    void deleteById(Long id);

    Tag updateTagById(Long id, Tag tag);
}
