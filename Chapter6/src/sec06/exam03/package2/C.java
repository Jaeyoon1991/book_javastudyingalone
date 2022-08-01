package sec06.exam03.package2;

import sec06.exam03.package1.*;

public class C {
    // A a; A는 다른 패키지(package1)에서 default로 선언됐기 때문에 여기서 사용 불가능
    B b; //B는 다른 패키지(package1)에서 public으로 선언됐기 때문에 여기서 사용 가능하다.
}
