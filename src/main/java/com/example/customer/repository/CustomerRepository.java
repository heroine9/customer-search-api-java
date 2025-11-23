package com.example.customer.repository;

import com.example.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Customer エンティティに対するデータアクセスを行うリポジトリ。
 * Spring Data JPA により、基本的なCRUD操作が自動的に提供されます。
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    /**
     * 顧客名に指定した文字列が含まれるレコードを（大文字小文字を区別せずに）検索します。
     *
     * @param name 検索キーワード
     * @return 該当する顧客のリスト
     */
    List<Customer> findByNameContainingIgnoreCase(String name);

    /**
     * 指定したリスクレベルに一致する顧客を検索します。
     *
     * @param riskLevel リスクレベル
     * @return 該当する顧客のリスト
     */
    List<Customer> findByRiskLevel(String riskLevel);
}
