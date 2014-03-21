# You need to install Vagrant (vagrant.org) and VirtualBox (virtualbox.org)
# for this to work. Then invoke "vagrant up"

Vagrant.require_version ">= 1.5.0", "< 1.6.0"

$script = <<SCRIPT

sudo apt-get update
sudo apt-get install -y git make default-jdk unzip subversion

git clone https://github.com/plasma-umass/AutoMan
cd AutoMan
git checkout 0bae69d910ff0d8f0788110caaccae194c71414a
make all

echo "*** Build reproduced. ***"

SCRIPT

Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/precise32"
  config.vm.provision "shell",  inline: $script, :privileged => false
end
