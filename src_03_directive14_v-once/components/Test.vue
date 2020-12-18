<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">

    <!-- 변경된 이름으로 적용됨 -->
    <p>기본: <b>{{ username }}</b></p>
    <p>v-once1 <b>{{ username }}</b></p>

    <!-- 변경된 내용이 한 번만 적용되지 않게 하는 v-one디렉티브 -->
    <p>v-once2 <b v-once>{{ username }}</b></p>
    {{ changName() }} <!-- methods도 같이 사용해줘야함 -->
    
  </div>
</template>

<script>
export default {
  data() {
    return {
      username: '펭수'
    }
  },
  methods: {
    changName: function(){
      this.username = '뽀로로'
    }
  }
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */

</style>
