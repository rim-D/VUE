<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <span><b>lazy</b><input type="text" v-model.lazy="lazy" placeholder="값 입력 후 엔터"></span> <!-- enter사용 -->
    <p>lazy: {{ lazy }}</p>

    <span><b>number</b><input type="text" v-model.number="number" placeholder="값 입력 후 엔터"></span> <!-- enter사용 -->
    <p>number: {{ number }}</p>

    <span><b>tirm</b><input type="text" v-model.trim="tirm" placeholder="값 입력 후 엔터"></span> <!-- enter사용 -->
    <p>tirm: {{ tirm }}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      lazy: '', // enter사용
      number: '', // 숫자 입력 후에 문자 입력시 반영 안됨
      tirm: '' // 스페이스 키값의 공백 제거됨
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
span {
  display: block;
  margin-bottom: 10px;
}
b {
  margin-right: 10px;
}


</style>
