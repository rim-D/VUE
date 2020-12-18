<template><!-- 자식 HTML 구현 부분 -->
  <div>
    메세지: {{ msg }}
    <!-- 
      App컴포넌트에서 자식컴포넌트로 쌓여져 있는 내용부분이 
      slot으로 지정시 전체 다 출력되고,
      섹션단위로 불러오고 싶을 땐 name으로 불러오면 됨
    -->
    <!-- <slot></slot>  -->
    <slot name="a"></slot>
    <slot name="b"></slot>
  </div>
</template>

<script>
export default {
  name: 'slot',
  props: { // 부오에서 오는 데이터 받는 부분
    msg: String // 프롭스 msg 타입은 String 
  }
}
</script>
