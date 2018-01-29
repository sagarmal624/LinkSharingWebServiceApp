package com.yakkaytech.linkSharing.repository.hibernate;




import com.yakkaytech.linkSharing.domain.User;
import com.yakkaytech.linkSharing.repository.common.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

@Repository("userRepositoryImpl")
public class UserRepositoryImpl extends BaseRepositoryImpl {

    public UserRepositoryImpl(){super.setClazz(User.class);};

}
