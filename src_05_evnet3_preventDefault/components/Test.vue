<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <h1>1. 기본이벤트 처리방지</h1>
    <a href="http://www.daum.net" @click="x">다음 - preventDefault</a>
    <a href="http://www.daum.net" target="_blank">다음2</a>
  </div>
</template>

<script>
export default {
  methods: {
    x: function(e){
      e.preventDefault();
      
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
