<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <h1>좋아하는 과일을 선택하세요</h1>
    <input type="checkbox" v-model="fruit" value="사과">사과<br>
    <input type="checkbox" v-model="fruit" value="배">배<br>
    <input type="checkbox" v-model="fruit" value="바나나">바나나<br>
    <input type="checkbox" v-model="fruit" value="수박">수박<br>

    선택한 과일은: {{ fruit }}
  
  </div>
</template>

<script>
export default {
  data() {
    return {
      fruit:[] //주의
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */



</style>
