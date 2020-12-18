<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <!-- v-show은 앵귤러의 ngIf와 비슷함 -->
    <!-- true 경우만 출력 -->
    <p v-show=true>true</p> 
    <p v-show="true">true</p>
    <p v-show="flag">flag</p>
    <p v-show="! false">! false</p>
    <p v-show="false">false</p>
    <p v-show="! true">! true</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      flage: false
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */



</style>
