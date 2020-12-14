<template> <!-- HTML 구현 부분 -->
  <div id="app">
    <BookList v-bind:bookList="list"/><!-- 자식 사용 -->
  </div>
</template>

<script> /*  component calss 코드 구현 부분  */
import BookList from './components/BookList.vue' // 자식 import

export default { // 다른 곳에서 사용시 VUE파일 이름으로 import
  name: 'App',
  components: {
    BookList // 사용 컴포넌트 등록(자식)
  },
  data: ()=> {
    return {
      list: [ // 도서에 대한 정보 list로 담기
        {id:'p01', name:'위험한 식탁', price:2000, date:'20170401', img:'a'},
        {id:'p02',name:'공부의 비결',price:3000, date:'20170402',img:'b'},
        {id:'p03',name:'오메르타',   price:2500, date:'20170401',img:'c'},
        {id:'p04',name:'행복한 여행',price:4000, date:'20170401',img:'d'},
        {id:'p05',name:'해커스 토익',price:2000, date:'20170401',img:'e'},
        {id:'p06',name:'도로 안내서',price:2000, date:'20170401',img:'f'},
      ]
    }
  }
}
</script>

<style> /*  CSS 구현 부분  */
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
