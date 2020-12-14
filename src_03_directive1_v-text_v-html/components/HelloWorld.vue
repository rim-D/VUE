<template><!-- 자식 HTML 구현 부분 -->
  <div class="hello">
    1) v-text : <span v-text="x"></span><br> <!-- v-text: innerText와 동일 -->
    2) v-html : <span v-html="y"></span><!-- v-html: innerHTML와 동일 -->
  </div>
</template>

<script>
export default {
  data() {
    return {
      x: '홍길동',
      y: '<h1>홍길동</h1>'
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
</style>
