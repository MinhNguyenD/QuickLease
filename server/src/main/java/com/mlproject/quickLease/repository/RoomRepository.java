package com.mlproject.quickLease.repository;

import com.mlproject.quickLease.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
