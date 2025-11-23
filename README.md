# customer-search-api-java
# Customer Search API (Java / Spring Boot)

## 概要

簡単な「顧客検索API」のデモプロジェクトです。  
Spring Boot + Spring Data JPA + H2 Database を使用して、名前で顧客検索ができるREST APIを実装しています。

## 技術スタック

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database

## 実行方法

1. プロジェクトをクローンするかダウンロードします。
2. IDE（IntelliJ など）で開きます。
3. `CustomerSearchApiApplication` を実行します。
4. ブラウザまたは curl で以下にアクセスします：

```bash
GET http://localhost:8080/api/customers
GET http://localhost:8080/api/customers?name=wu
