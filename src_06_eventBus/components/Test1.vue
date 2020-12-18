<template>
  <div>
      <input type="text" v-bind:value="receive">
  </div>
</template>

<script>
import eventBus from './EventBus.vue';
export default {
data: function() {
    return {
      receive: "호출전",
    };
  },
  // eventBus.$on을 이용하여 처리할 이벤트 함수 등록
  created(){
      console.log("creat호출");
      eventBus.$on("start", this.handleEvent); // 이벤트 함수 등록
  },
  methods: {
      handleEvent: function(){
          console.log("handleEvent호출됨 ======");
          this.receive = "호출 완료======"
      }
  }

}
</script>

<style>

</style>