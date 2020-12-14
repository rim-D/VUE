<template><!-- 자식 HTML 구현 부분 -->
  <div class="book">
    <h1>도서목록 {{ bookList.length }}권</h1>
    <ul>
      <!-- v-bind: key ="유일값" 반드시 지정주의!!! -->
      <li v-for="book in bookList" v-bind:key="book.name"> 
        <!-- v-for를 통한 book정보 출력 -->
        <img v-bind:src="require(`@/assets/image/${book.img}.jpg`)">
        <b>{{ book.name }}</b>
      </li>
    </ul><!-- App.vue에서 Template에서 msg를 전달받아 바인딩함 -->
  </div>
</template>

<script>
export default {
  props: { // 부오에서 오는 데이터 받는 부분
    bookList: Array ,// bokkList타입은 Array 지정
  }
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
.book {
  display: flex;
  flex-direction: column;
  justify-content: center;
}
ul, li {
  list-style: none;
  margin: 0;
  padding: 0;
}
ul {
  display: flex;
  flex-direction: row;
  justify-content: center;
}
li {
  margin: 0 10px;
}
b {
  display: block;
}

</style>
