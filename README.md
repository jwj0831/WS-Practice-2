# 2014년 가을학기 Web Service 실습 2
---

# 실습조교: 조우진
# 메일주소: jwj0831@gmail.com

## 실습 목표
* Java RESTful Web Service
* Jersey 소개
* Jersey Client 활용

### JAX-RS & Jersey 
* JAX-RS Spec(https://jax-rs-spec.java.net/)
* http://en.wikipedia.org/wiki/Java_API_for_RESTful_Web_Services
* Jersey는 JAX-RS의 구현


### Jersey Client 활용
* 의존 라이브러리 삽입
 * http://mvnrepository.com/artifact/org.glassfish.jersey.core
* https://jersey.java.net/documentation/latest/client.html
* 바로 테스트
 * 간단한 방법 / getSimpleHTTP()
 * 복잡하지만 유연한 방법 / getFluentHTTP()
* TEST http://developer.naver.com/wiki/pages/News
 * http://openapi.naver.com/search?key=c1b406b32dbbbbeee5f2a36ddc14067f&query=%EC%A3%BC%EC%8B%9D&target=news&start=1&display=10

### 종합 실습 XML & Jersey Client
* XML파싱과 함께 직접 실습해 보기 
 * http://www.w3schools.com/xml/simple.xml
 * http://www.w3schools.com/xml/plant_catalog.xml