package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 顧客情報に関するAPIエンドポイントを提供するコントローラー。
 * /api/customers 配下のリクエストを処理します。
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    /** 顧客検索のビジネスロジックを提供するサービス */
    private final CustomerService service;

    /**
     * コンストラクタインジェクションでサービスを受け取る。
     *
     * @param service CustomerService のインスタンス
     */
    public CustomerController(CustomerService service) {
        this.service = service;
    }

    /**
     * 顧客名で検索する GET API。
     * name が指定されていない場合は全件を返します。
     *
     * @param name 検索キーワード（任意）
     * @return 該当する顧客リスト
     */
    @GetMapping
    public List<Customer> searchCustomers(@RequestParam(required = false) String name) {
        return service.searchByName(name);
    }
}
