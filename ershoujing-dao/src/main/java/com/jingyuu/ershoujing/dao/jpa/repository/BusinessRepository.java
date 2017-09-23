package com.jingyuu.ershoujing.dao.jpa.repository;

import com.jingyuu.ershoujing.dao.jpa.entity.BusinessEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author owen
 * @date 2017-09-07
 */
@Repository
public interface BusinessRepository extends CrudRepository<BusinessEntity, String> {
}
