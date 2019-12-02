## 우아한 테크코스 프리코스 1주차 미션 - 숫자 야구 게임

### 요구 사항
* 기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

* 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면  
포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
    * [예] 상대방(컴퓨터)의 수가 425일때, 123을제시한경우: 1스트라이크, 456을 제시한경우: 1 스트라이크 1볼,  
789를 제시한 경우: 낫싱

* 위 숫자 야구게임에서 상대방의 역할을 컴퓨터가한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.

* 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.

* 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
-----------------
### 구현 기능 목록

* 서로 다른 임의의 수 3개 구해서 세팅하기

* 입력 받기
    * 사용자 숫자 입력 시 예외상황 처리
        * 3자리 숫자인지
        * 숫자 이외의 문자
        * 중복된 수가 있는지
        * 1부터 9까지의 숫자 인지
	
    * 메뉴 숫자 입력 시 예외상황 처리
         * 1 또는 2인지
        * 숫자 이외의 문자

* 출력하기
    * 힌트 출력하기
    * 메뉴 출력하기
    * 입력 문구 출력하기
    * 정답 문구 출력하기

* 힌트 계산하기

* 정답인지 확인하기

* 게임 진행 로직 구현
