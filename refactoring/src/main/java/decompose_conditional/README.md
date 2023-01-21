# 조건문 분리
> 복잡한 조건문을 메서드로 분리하는 방법

## 기존 코드
 * 직관적으로 이해하기 복잡한 조건문을 `if` 키워드에다 바로 작성.
 * 가독성이 떨어지는 문제가 있음.

## 개선된 코드
 * 복잡한 조건문을 메서드로 분리.
 * `if` 문 내의 조건문이 메서드로 대체되기에, 메서드 명을 통해서 if문이 어떻게 작동하는지를 좀 더 편하게 파악할 수 있음.