// DisciplineList.vue
<template>
  <div>
    <h2>Список доступных дисциплин</h2>
    <ul>
      <li v-for="discipline in disciplines" :key="discipline">{{ discipline }}</li>
    </ul>
  </div>
</template>

<script>
import { inject } from 'vue';

export default {
  setup() {
    const disciplines = inject('disciplines');
    return { disciplines };
  }
};
</script>

<style scoped>
ul {
  list-style: none;
  padding: 0;
}
li {
  background: #57b0ff;
  margin: 5px 0;
  padding: 10px;
  border-radius: 5px;
}
</style>
