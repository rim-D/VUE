<template><!-- 자식 HTML 구현 부분 -->
  <div class="hello">
    <h1>{{ msg }}</h1> <!-- App.vue에서 Template에서 msg를 전달받아 바인딩함 -->
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: { // 부오에서 오는 데이터 받는 부분
    msg: String // 프롭스 msg 타입은 String 
  }
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
h3 {
  margin: 40px 0 0;
}

</style>
