package kr.tjoeun.listview_20200530.datas

class Student(inputName: String, iby: Int, gender: Boolean ) {
    
    val name = inputName //이름이 기본적으로 String이 되도록 초기화
    val birthYear = iby  // 생년은 기본으로 Int가 되게
    val isMale = gender  // 성별을 boolean을 true :남성 / false : 여성
    
}