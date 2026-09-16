$ErrorActionPreference = 'Stop'
Set-Location $PSScriptRoot
New-Item -ItemType Directory -Force bin | Out-Null
$junit = 'lib/junit-platform-console-standalone-1.14.4.jar'
$fontes = Get-ChildItem -LiteralPath src -Filter *.java | ForEach-Object { $_.FullName }
& javac -encoding UTF-8 -cp $junit -d bin $fontes
if ($LASTEXITCODE -ne 0) { throw 'Falha na compilacao.' }
& java -jar $junit execute --class-path bin --scan-class-path --fail-if-no-tests --disable-ansi-colors
if ($LASTEXITCODE -ne 0) { throw 'Falha nos testes.' }

