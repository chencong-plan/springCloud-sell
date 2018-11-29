## docker设置 仓库镜像加速

vim /etc/docker/daemon.json

```
{
  "registry-mirrors": ["https://fy707np5.mirror.aliyuncs.com"]
}
```

```
systemctl daemon-reload
systemctl restart docker
```