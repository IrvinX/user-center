package com.dbt.service;

import com.github.pagehelper.PageInfo;
import com.dbt.model.Resources;

import java.util.List;
import java.util.Map;

/**
 * Created by irvin on 2017/7/9.
 */
public interface ResourcesService extends IService<Resources> {
    PageInfo<Resources> selectByPage(Resources resources, int start, int length);

    public List<Resources> queryAll();

    public List<Resources> loadUserResources(Map<String, Object> map);

    public List<Resources> queryResourcesListWithSelected(Integer rid);
}
