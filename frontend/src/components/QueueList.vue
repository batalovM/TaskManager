// QueueList.vue
<template>
  <div>
    <h2>Общая очередь</h2>
    <table>
      <thead>
      <tr>
        <th>#</th>
        <th>Имя участника</th>
        <th>Время</th>
        <th>Дата</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="(entry, index) in queue" :key="entry.id">
        <td>{{ index + 1 }}</td>
        <td>{{ entry.name }}</td>
        <td>{{ entry.time }}</td>
        <td>{{ entry.date }}</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import { inject } from 'vue';

export default {
  setup() {
    const queue = inject('queue');
    return { queue };
  }
};
</script>

<style scoped>
table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 10px;
}
th, td {
  border: 1px solid #ddd;
  padding: 8px;
  text-align: left;
}
th {
  background-color: #57b0ff;
}
</style>

