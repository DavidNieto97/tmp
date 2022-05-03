cd frontend/vue
npm run build
cd .. 
cd ..
rclone sync -P frontend/vue/dist/assets taskproject/src/main/resources/static/assets 
rclone copyto -P frontend/vue/dist/index.html taskproject/src/main/webapp/WEB-INF/views/main.jsp
rclone copyto -P frontend/vue/dist/sample-data.json taskproject/src/main/resources/static/sample-data.json