# java-lotto-precourse

- [ ] 로또 게임을 시작한다.

- [ ] 로또 구입 금액을 입력 받는다. (로또 1장의 가격은 1,000원이다)
  - 사용자가 잘못된 값 입력한 경우 IllegalArgumentException 예외를 발생시킨다.
    - [x] 1,000원으로 나누어떨어지지 않는 경우

- [x] 구입 금액에 해당하는 만큼 로또를 발행한다.
  - 로또 번호가 올바르지 않은 경우 예외를 발생시킨다.
    - [x] 중복된 값 입력한 경우
    - [x] 6개가 아닌 경우
  - [x] 로또를 발행한다.
    - [x] 1-45 사이의 랜덤 번호 6개를 생성한다.

- [ ] 당첨 번호를 입력받는다.
  - 사용자가 잘못된 값 입력한 경우 IllegalArgumentException 예외를 발생시킨다.
    - [ ] 1-45 범위가 아닌 경우
    - [ ] 중복된 값 입력한 경우
    - [ ] 쉼표로 구분되지 않은 경우
    - [ ] 6개가 아닌 경우

- [ ] 보너스 번호를 입력받는다.
  - 사용자가 잘못된 값 입력한 경우 IllegalArgumentException 예외를 발생시킨다.
    - [ ] 1-45 범위가 아닌 경우
    - [ ] 중복된 값 입력한 경우
    - [ ] 1개 이상 입력한 경우

- [ ] 발행한 로또 수량 및 번호를 출력한다.
  - [ ] 로또 수량을 출력한다.
  - [ ] 로또번호를 오름차순으로 정렬한다.
  - [ ] 로또 수량만큼 로또 번호를 출력한다.

- [ ] 당첨내역을 출력한다.
  - [ ] 로또번호가 당첨번호와 일치하는 개수를 계산한다.
  - [ ] 번호 일치 개수에 따라 1등부터 5등까지 구분한다. (등수에 따라 상금이 달라진다.)

- [ ] 수익률을 출력한다.
  - [ ] 수익률을 계산한다.
  - [ ] 소수점 둘째자리에서 반올림한다.

- [ ] 로또 게임을 종료한다.

- 사용자가 잘못된 값 입력할 경우
  - IllegalArgumentException 발생 시킨다
  - "[ERROR]"로 시작하는 에러 메시지를 출력한다.
  - 잘못된 값부터 입력을 다시 받는다.
  - 예외는 Exception이 아닌 명확한 유형을 처리해야한다.