package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 顧客検索に関するビジネスロジックを提供するサービスクラス。
 */
@Service
public class CustomerService {

    /** 顧客データへアクセスするためのリポジトリ */
    private final CustomerRepository repository;

    /**
     * コンストラクタインジェクションによりリポジトリを注入。
     *
     * @param repository CustomerRepository のインスタンス
     */
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    /**
     * 顧客名に基づいて検索を行う。
     * 名前がnullまたは空文字の場合は、全件を返します。
     *
     * @param name 顧客名の検索キーワード
     * @return 該当する顧客のリスト
     */
    public List<Customer> searchByName(String name) {
        if (name == null || name.isEmpty()) {
            return repository.findAll();
        }
        return repository.findByNameContainingIgnoreCase(name);
    }

    /**
     * リスクレベルに基づいて顧客を検索します。
     *
     * @param riskLevel リスクレベル
     * @return 該当する顧客のリスト
     */
    public List<Customer> searchByRiskLevel(String riskLevel) {
        return repository.findByRiskLevel(riskLevel);
    }
}
