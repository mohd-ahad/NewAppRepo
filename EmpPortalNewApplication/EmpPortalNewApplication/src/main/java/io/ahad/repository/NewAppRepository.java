package io.ahad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.ahad.entity.NewApp;

@Repository
public interface NewAppRepository extends JpaRepository<NewApp, Long> {
}
