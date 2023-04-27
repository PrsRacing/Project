package com.example.carservice.repository;

import com.example.carservice.model.entity.ServiceOrder;
import com.example.carservice.model.view.ServiceOrderViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Long> {

    List<ServiceOrder> findAllByOrderByPriceDesc();
}
