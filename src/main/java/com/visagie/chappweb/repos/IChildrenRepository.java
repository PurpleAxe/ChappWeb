package com.visagie.chappweb.repos;

import com.visagie.chappweb.models.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.OrderBy;

@Repository
public interface IChildrenRepository extends JpaRepository<Child, Long> {

}
