<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    점수: <input type="text" v-model.number="grade">  <!-- number사용 -->
    <p v-if="grade > 90">A학점</p>
    <p v-else-if="grade > 80">B학점</p>
    <p v-else-if="grade > 70">C학점</p>
    <p v-else>F학점</p>
  </div>
</template>

<script>
export default {
  data:() => {
    return {
      grade: 50
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */

p {
  color: red;
  font-weight: bold;
}

</style>
