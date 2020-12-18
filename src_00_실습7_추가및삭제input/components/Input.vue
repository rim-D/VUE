<template>
  <div>
      <!-- v-model="msg"를 설정하면 input에 입력된 값이 전달됨 -->
      <input type="text" v-on:keyup.enter="add" v-model="msg" placeholder="이름을 입력해주세요">
  </div>
</template>

<script>
import eventBus from './EventBus.vue';
export default {
    data: function(){
        return{
            msg: '', //이름 저장 변수, 버스로 전달
        }
    },
    methods: {
        add: function(){
            // 이벤트버스 전달 (이벤트명 start 와 input의 메세지를 this.msg로 담아 파라미터로 전달)
            eventBus.$emit("start", this.msg); 
            this.msg = ''; //input text 초기화
       }
    }
}
</script>

<style>

</style>