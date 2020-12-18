<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">

    <h1>교재 정보</h1>
    <ul>
      <li v-for="(book, i) in bookList" v-bind:key="i">
        <!-- v-bind:value-"book" value값이 v-model="books"에 저장됨 -->
        <input type="checkbox" v-model="books" v-bind:value="book">
        {{ book.name}} , {{ book.price }}원
        <button type="button" v-on:click="del" data-idx="index">삭제</button>
      </li>
    </ul>

     <p>----------------------------</p>

    <button type="button" v-on:click="Alldel">전체삭제</button>

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
  methods: {
    del: function(e){
      var delIdx = e.target.dataset.idx;
      console.log("delIndx===", delIdx);
      this.bookList.splice(delIdx,1); // index해당 항목 1개 삭제
    },
    Alldel: function(){
      var delBookList = this.bookList;
      console.log("delBookList==",delBookList); // 전체 도서
      console.log(this.books); // 선택한 도서

      this.books.map(function(ele, idx){ // books에서 책한권 ele:책제목
        delBookList.map(function(e, i){ // bookList 한권 책정보 {name...price}, i:index
          if(ele == e.name){ // books의 책제목과 bookList(xx)책제목이 동일하면
            console.log(i, idx);
            delBookList.splice(i, 1); // bookList(xx)에서 삭제
          }
        })
      })

    },
  },
  
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
