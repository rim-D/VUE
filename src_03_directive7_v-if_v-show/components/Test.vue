<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <p>
      v-if는 조건에 일치하지 않으면 렌더링 안됨<br>
      v-show는 랜더링은 되지만 화면에 안보임<br>
      (display: none스타일 소석으로만 동작)
    </p>

    <p v-if="amount==1">v-if hello1</p>
    <p v-show="amount==1">v-show hello2</p>
    <p v-if="amount!=1">v-if hello3</p>
    <p v-show="amount!=1">v-show hello4</p> <!-- display:none; -->
    
  </div>
</template>

<script>
export default {
  data() {
    return {
      amount: 1
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */



</style>
