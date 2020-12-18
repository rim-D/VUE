<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <p>
      v-if는 조건에 일치하지 않으면 렌더링 안됨<br>
      v-show는 랜더링은 되지만 화면에 안보임<br>
      (display: none스타일 소석으로만 동작)
    </p>

    <p v-if="3 > 1">hello1</p> <!-- true -->
    <p v-show="num >= num2">hello2</p> <!-- true -->
    <p v-if="num > num2 && 3 == 3">hello3</p> <!-- true -->
    <p v-show="num < num2 || 3 == 3">hello4</p> <!-- true -->
  </div>
</template>

<script>
export default {
  data() {
    return {
      num: 10,
      num2: 5
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */



</style>
