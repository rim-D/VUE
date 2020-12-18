<template>
  <div>
      <h1>이벤트 버스 실습</h1>
      <button v-on:click="test">Test로 전달(이벤트로 전달)</button>
  </div>
</template>

<script>
import eventBus from './EventBus.vue';
export default {
    methods: {
        test: function(){
            eventBus.$emit("start"); // 이벤트버스 전달 이벤트명 start
        }
    }
}
</script>

<style>

</style>