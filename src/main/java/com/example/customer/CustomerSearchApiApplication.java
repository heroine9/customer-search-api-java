package com.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * アプリケーションのエントリーポイントとなるクラス。
 * Spring Boot による顧客検索 API を起動します。
 */
@SpringBootApplication  
public class CustomerSearchApiApplication {

    /**
     * アプリケーションを起動するための標準的なエントリーポイントです。
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        SpringApplication.run(CustomerSearchApiApplication.class, args);  // Spring Bootアプリを実行
    }
}
