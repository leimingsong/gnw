package com.gnw.Service.admin.lbt.impl;

import com.gnw.Dao.admin.lbt.TbAdDao;
import com.gnw.Pojo.admin.lbt.TbAd;
import com.gnw.Service.admin.lbt.TbAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbAdServiceImpl implements TbAdService {

    @Autowired
    private TbAdDao tbAdDao;

    @Override
    public List<TbAd> queryAllAds() {
        List<TbAd> tbAds = tbAdDao.selectByExample(null);
        return tbAds;
    }


}
