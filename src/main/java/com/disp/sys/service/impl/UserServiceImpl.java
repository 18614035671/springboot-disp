package com.disp.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.disp.sys.dao.UserDao;
import com.disp.sys.entity.UserEntity;
import com.disp.sys.service.UserService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> getUser() {
        return this.list(new QueryWrapper<UserEntity>());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void insertUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("55555");
        userEntity.setPassword("123456");
        userEntity.setDeptId(41);
        userEntity.setEmail("asd");
        userEntity.setMobile("das");
        userEntity.setStatus("1");
        userEntity.setCrateTime(new Date());
        userEntity.setModifyTime(new Date());
        userEntity.setLastLoginTime(new Date());
        userEntity.setSsex("1");
        userEntity.setTheme("2");
        userEntity.setAvatar("2");
        userEntity.setDescription("3");
        userDao.insert(userEntity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void updateUser(Integer id) {
        /*int mmp = userDao.update(
                new UserEntity().setUserId(id),
                Wrappers.<UserEntity>lambdaUpdate()
                        .set(UserEntity::getUsername, "mmp")
                        .eq(UserEntity::getUserId, 2)
        );*/
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(id);
        userEntity.setEmail("9999999999999999999@123.com");
        userDao.updateById(userEntity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void delAllUser(String[] ids) {
        userDao.deleteBatchIds(Arrays.asList(ids));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void deleteUser(Integer id) {
        userDao.deleteById(id);
    }

    /**
     * 不太好使
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public IPage<UserEntity> getUserPage(Integer currentPage, Integer pageSize) {
        IPage<UserEntity> page = new Page<>(currentPage, pageSize);
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("CRATE_TIME");
        return userDao.selectPage(page, wrapper);
    }

    //@Override
    //public UserEntity findByName(String userName) {
    //   /* Example example = new Example(User.class);
    //    example.createCriteria().andCondition("lower(username)=", userName.toLowerCase());
    //    List<User> list = this.selectByExample(example);
    //    return list.isEmpty() ? null : list.get(0);*/
    //    return null;
    //}
    //System.out.println("----- baseMapper 自带分页 ------");
    //Page<User> page = new Page<>(1, 5);
    //IPage<User> userIPage = mapper.selectPage(page, new QueryWrapper<User>()
    //        .eq("age", 20).eq("name", "Jack"));
    //assertThat(page).isSameAs(userIPage);
    //    System.out.println("总条数 ------> " + userIPage.getTotal());
    //    System.out.println("当前页数 ------> " + userIPage.getCurrent());
    //    System.out.println("当前每页显示数 ------> " + userIPage.getSize());
    //print(userIPage.getRecords());
    //    System.out.println("----- baseMapper 自带分页 ------");
    //
    //    System.out.println("json 正反序列化 begin");
    //String json = JSON.toJSONString(page);
    //Page<User> page1 = JSON.parseObject(json, TypeBuilder.newInstance(Page.class).addTypeParam(User.class).build());
    //print(page1.getRecords());
    //    System.out.println("json 正反序列化 end");
    //
    //    System.out.println("----- 自定义 XML 分页 ------");
    //MyPage<User> myPage = new MyPage<User>(1, 5).setSelectInt(20).setSelectStr("Jack");
    //ParamSome paramSome = new ParamSome(20, "Jack");
    //MyPage<User> userMyPage = mapper.mySelectPage(myPage, paramSome);
    //assertThat(myPage).isSameAs(userMyPage);
    //    System.out.println("总条数 ------> " + userMyPage.getTotal());
    //    System.out.println("当前页数 ------> " + userMyPage.getCurrent());
    //    System.out.println("当前每页显示数 ------> " + userMyPage.getSize());
    //print(userMyPage.getRecords());
    //    System.out.println("----- 自定义 XML 分页 ------");
}
