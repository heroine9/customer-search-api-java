package com.example.customer.model;

import jakarta.persistence.*;

/**
 * 顧客情報を保持するエンティティクラス。
 * データベースの「customers」テーブルにマッピングされます。
 */
@Entity
@Table(name = "customers")
public class Customer {

    /**
     * 主キー。自動採番（IDENTITY 戦略）で生成されます。
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 顧客名 */
    private String name;

    /** メールアドレス */
    private String email;

    /** リスクレベル */
    private String riskLevel;

    /** デフォルトコンストラクタ */
    public Customer() {
    }

    /**
     * フィールドを指定して Customer オブジェクトを生成するコンストラクタ。
     *
     * @param name 顧客名
     * @param email メールアドレス
     * @param riskLevel リスクレベル
     */
    public Customer(String name, String email, String riskLevel) {
        this.name = name;
        this.email = email;
        this.riskLevel = riskLevel;
    }

    /** @return 主キーID */
    public Long getId() {
        return id;
    }

    /** @return 顧客名 */
    public String getName() {
        return name;
    }

    /** 顧客名を設定 */
    public void setName(String name) {
        this.name = name;
    }

    /** @return メールアドレス */
    public String getEmail() {
        return email;
    }

    /** メールアドレスを設定 */
    public void setEmail(String email) {
        this.email = email;
    }

    /** @return リスクレベル */
    public String getRiskLevel() {
        return riskLevel;
    }

    /** リスクレベルを設定 */
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
}
