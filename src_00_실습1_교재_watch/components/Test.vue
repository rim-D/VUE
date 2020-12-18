<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">

    <h1>교재 정보</h1>
    <ul>
      <li v-for="(book, i) in bookList" v-bind:key="i">
        <!-- v-bind:value-"book" value값이 v-model="books"에 저장됨 -->
        <input type="checkbox" v-model="books" v-bind:value="book">
        {{ book.name}} , {{ book.price }}원
      </li>
    </ul>

    <p>----------------------------</p>
    <h1>선택된 교재</h1>
    <!-- 선택한 교재의 이름만 v-for로 돌림 -->
    <span v-for="(book, i) in books" v-bind:key="i">{{ book.name }} , {{ book.price }}원</span>

    <p>----------------------------</p>
    <span>총합: {{ total }}</span><!-- watch사용 구현 -->

  </div>
</template>

<script>
export default {
  data() {
    return {
      bookList: [ // 도서 리스트
        {name: '자바의 정석', price: 2000},
        {name: 'JSP의 정석', price: 2000},
        {name: 'Spring의 정석', price: 10000},
        {name: 'JAVASCRIOT의 정석', price: 10000},
        {name: 'Vue의 정석', price: 5000},
      ],
      books:[], // 선택된 book목록
      total: 0 // 총합
    }
  },
  watch: { // 객체 속성 감시 - books가 변경될때 실행됨
    books:function(){ // watch는 반드시 변수명과 메소드명을 일치시켜야함!!
    let num = 0; // 총합변수
    const book = this.books; // 선택한 도서목록 저장
    book.map(function(ele, i){ // 콜백함수 
      console.log(i, ele.name, ele.price);
      num = num + ele.price; // 총합누적
    });
    this.total = num;
    }
  }
  
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
ul, li {
  list-style: none;
  padding: 0;
  margin: 0;
}
span {
  display: block;
}
</style>
