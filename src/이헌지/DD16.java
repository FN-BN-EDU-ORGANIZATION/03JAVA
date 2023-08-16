package 이헌지;

package C023진법;

//3.4 정수의 진법 변환

//10진수를 n진수로 변환
//10진수를 다른 진수로 변환하려면,해당 진수로 나누고 나머지 값을 옆에 적는 것을 더 이상 나눌 수 없을 때 까지 반복한 다음
//마지막 몫과 나머지를 아래부터 위로 순서대로 적으면 된다. 글로 설명하니까 복합한 것 같지만 사실은 쉽다.
//예를 들어 10진수 46을 2진수로 변환하려면,46을 2로 나누고 그 몫과 나머지를 아래의 그림과 같이 적는다.
/*
             46/2 → 23 ...0                         
                    몫   나머지 
*/
//이 작업을 몫이 나누는 값인 2보다 작을 때까지 반복한다.
/*     
            46/2 → 23/2 → 11/2 → 5/2 → 1  |
       나머지   0      1     1       1  0   |
            < ____________________________|                                
              = 46(10) -> 101110(2) 
*/
//이제 마지막 몫부터 나머지를 아래서 위로 순서대로 적기만 하면 2진수로 변환한 결과가 된다.
//10진수를 8진수 또는 16진수로 변환하려면 2대신 8이나 16으로 나누면 된다. 
//즉,n진수로 변환하려면,n으로 반복해서 나누기만 하면 되는 것이다.
/*
                816/2  → 102/8 →12/8 → 1  |
        나머지      0        6       4      |
            < ____________________________|                                
              = 816(10) -> 1460(8) 
*/
//n진수를 10진수로 변환
//어떤 진법의 수라도 10진수로 변환하는 방법은 똑같다. 각 자리의 수에 해당 단위의 값을 곱해서 모두 더하면 된다.
//예를 들어 10진수 123은 다음과 같이 풀어쓸 수 있다.
/*
  123(10)= 100 + 20 + 3
         = 1 X 100 + 2 X 10 + 3 X 1
         = 1 X 10^2 + 2 X 10^1 + 3 x 10^0
         
         = 
          
*/    
package C023진법;

//3.5 실수의 진법변환
//10진 소수점수를 2진 소수점수로 변환하는 방법
//앞서 10진 정수를 2진 정수로 변환할 때,10진수를 2로 계속 나누면서 나머지를 구헀던 것을 기억할 것이다. 
//10진 소수점수를 2진 소수점수로 변환하는 방법은 이와 반대로 10진 소수점수에 2를 계속 곱한다.
//예를 들어 10진수 0.625를 2진수로 변환하는 방법은 다음과 같다.
/*
1. 10진 소수에 2를 곱한다. 
                   
                  0.625 x 2 = 1.25

2. 위의 결과에서 소수부만 가져다가 다시 2를 곱한다.

                  0.625 x 2 = 1.25
                                |
                  |------------ |
                  ↓
                0.25 x 2 = 0.5

3. 1과 2의 과정을 소수부가 0이 될 때까지 반복한다.
            
    0.625 x 2 = 1.25
    0.25  x 2 = 0.5
    0.5   x 2 = 1.0
*/
//|참고| 3의 과정에서 소수가 0이 되지않고 무한히 반복될 수도 있다.

//위의 결과에서 정수부만을 위에서 아래로 순서대로 적고 '0.'을 앞에 붙이면 된다
/*
    0.625 x 2 = 1.25  |
    0.25  x 2 = 0.5   |
    0.5   x 2 = 1.0   |
                      ↓
    0.625(10) → 0.010(2)            
*/
//참고로 10진 소수를 10진 소수로 변환하는 방법은 다음과 같다. 2대신 10을 곱할 뿐이다.
//10진 소수를 2진 소수로 변환하는 방법을 기억하는데 도움이 될 것이다.
/*
    0.625  x 10 = 6.25
    0.25   x 10 = 2.5
    0.5    x 10 = 5.0
    
    0.625(10) → 0.625(10)            
*/
//2진 소수점수를 10진 소수점수로 변환하는 방법 
//그러면,이제 2진 소수를 10진소수로 바꿔서 0.101(2)가 정말로 0.625(10)인지 확인해보자.
/*
0.625(10)를 다음과 같이 표현할 수 있듯이

            10^-1   10^-2   10^-3 
       |0.|   6   |   2   |   5   |
      
       0.625(10) = 6 x 10^-1 + 2 x 10^-2 + 5 x 10^-3
       
 0.101(2)는 다음과 같이 표현 할 수 있다.
 
                  2^-1      2^-2      2^-3
          | 0. |    1    |    0    |   1    |        
       
      0.101(2) = 1 x 2^-1 + 0 x 2^-2 + 1 x 2^-3
               = 1 x 0.5 + 0x 0.25 + 1 x 0.125
               = 0.5 + 0.125
               = 0.625(10)
               
  위의 계산과정을 통해 0.101(2)이 0.625(10)라는 것을 확인할 수 있다.
  
  |참고 123.456처럼 정수부가 있는 소수점수는 정수부 123과 소수점부 0.456을 따로 변환한 다음에 더하면 된다.
*/
             
    
