<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <span>갑입력:<input type="text" v-model="amount"></span>
    <span v-if="amount<100">100보단 <b>작은 값</b>입니다.</span>
    <span v-if="amount>100">100보단 <b>큰 값</b>입니다.</span>
  </div>
</template>

<script>
export default {
  data() {
    return {
      amount: 100
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */

span {
  display: block;
}

</style>
