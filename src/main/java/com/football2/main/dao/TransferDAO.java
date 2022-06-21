package com.football2.main.dao;

import com.football2.main.models.Transfers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferDAO extends JpaRepository<Transfers,Integer> {
}
