package com.xxy.blog.service.impl;

import com.xxy.blog.NotFoundException;
import com.xxy.blog.dao.TagRepository;
import com.xxy.blog.po.Tag;
import com.xxy.blog.service.TagService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagRepository tagRepository;

    @Transactional
    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return tagRepository.findAll(pageable);
    }

    @Transactional
    @Override
    public Tag saveTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Transactional
    @Override
    public Tag getTagByName(String name) {
        return tagRepository.findTagByName(name);
    }

    @Transactional
    @Override
    public Tag getById(Long id) {
        return tagRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        tagRepository.deleteById(id);
    }

    @Transactional
    @Override
    public Tag updateTagById(Long id, Tag tag) {
        Tag t = tagRepository.findById(id).get();
        if(t == null) {
            throw new NotFoundException("不存在该标签");
        }
        BeanUtils.copyProperties(tag, t);

        return tagRepository.save(tag);
    }
}
