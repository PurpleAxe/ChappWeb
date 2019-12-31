package com.visagie.chappweb.repos;

import com.visagie.chappweb.models.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChildrenRepository extends JpaRepository<Child, Long> {

}
